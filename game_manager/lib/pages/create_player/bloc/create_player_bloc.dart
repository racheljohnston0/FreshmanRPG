import 'package:bloc/bloc.dart';
import 'package:equatable/equatable.dart';
import 'package:flutter/cupertino.dart';

import '../../../repository/crew/crew_repository.dart';
import '../../../repository/crew/get_all_crews_request.dart';
import '../../../repository/crew/get_all_crews_response.dart';
import '../../../repository/player/get_all_majors_request.dart';
import '../../../repository/player/get_all_majors_response.dart';
import '../../../repository/player/player_repository.dart';
import '../../../repository/player/create_player_request.dart';
import '../../../repository/player/basic_response.dart';

part 'create_player_event.dart';
part 'create_player_state.dart';

class CreatePlayerBloc extends Bloc<CreatePlayerPageEvent, CreatePlayerPageState> {
  late CreatePlayerRequest data;
  final PlayerRepository playerRepository;
  final CrewRepository crewRepository;

  CreatePlayerBloc({
    required this.crewRepository,
    required this.playerRepository
  }) : super (CreatePlayerInitial()) {
    on<SendCreatePlayerEvent>((event, emit) async {
      emit(CreatePlayerLoading());
      BasicResponse response = await playerRepository.createPlayer(CreatePlayerRequest
        (playerName:
      event.playerName, password: event.password, crew: event.crew,
          major: event.major, section: event.section));

        emit(CreatePlayerComplete(response));
    });

    on<SendGetMajorsAndCrewsEvent>((event, emit) async {
      emit(CreatePlayerLoading());
      GetAllCrewsResponse crewsResponse = await crewRepository.getAllCrews(const GetAllCrewsRequest());
      GetAllMajorsResponse majorsResponse = await playerRepository.getAllMajors(const GetAllMajorsRequest());

      emit(GetMajorsAndCrewsComplete(majorsResponse, crewsResponse));
    });
  }


}


