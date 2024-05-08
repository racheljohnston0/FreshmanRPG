// Mocks generated by Mockito 5.3.2 from annotations
// in game_manager/test/pages/create_player/create_player_test.dart.
// Do not manually edit this file.

// ignore_for_file: no_leading_underscores_for_library_prefixes
import 'dart:async' as _i8;

import 'package:dio/dio.dart' as _i2;
import 'package:game_manager/repository/player/all_players_request.dart'
    as _i11;
import 'package:game_manager/repository/player/all_players_response.dart'
    as _i4;
import 'package:game_manager/repository/player/basic_response.dart' as _i3;
import 'package:game_manager/repository/player/change_player_request.dart'
    as _i10;
import 'package:game_manager/repository/player/create_player_request.dart'
    as _i9;
import 'package:game_manager/repository/crew/get_all_crews_request.dart'
    as _i13;
import 'package:game_manager/repository/crew/get_all_crews_response.dart'
    as _i6;
import 'package:game_manager/repository/player/get_all_majors_request.dart'
    as _i12;
import 'package:game_manager/repository/player/get_all_majors_response.dart'
    as _i5;
import 'package:mockito/mockito.dart' as _i1;

import 'crews_test.dart' as _i7;

// ignore_for_file: type=lint
// ignore_for_file: avoid_redundant_argument_values
// ignore_for_file: avoid_setters_without_getters
// ignore_for_file: comment_references
// ignore_for_file: implementation_imports
// ignore_for_file: invalid_use_of_visible_for_testing_member
// ignore_for_file: prefer_const_constructors
// ignore_for_file: unnecessary_parenthesis
// ignore_for_file: camel_case_types
// ignore_for_file: subtype_of_sealed_class

class _FakeGetAllCrewsResponse_4 extends _i1.SmartFake
    implements _i6.GetAllCrewsResponse {
  _FakeGetAllCrewsResponse_4(
      Object parent,
      Invocation parentInvocation,
      ) : super(
    parent,
    parentInvocation,
  );
}

/// A class which mocks [PlayerRepositoryTest].
///
/// See the documentation for Mockito's code generation for more information.
class MockCrewRepositoryTest extends _i1.Mock
    implements _i7.CrewRepositoryTest {
  MockPlayerRepositoryTest() {
    _i1.throwOnMissingStub(this);
  }

  _i8.Future<_i6.GetAllCrewsResponse> getAllCrews(
          _i13.GetAllCrewsRequest? request) =>
      (super.noSuchMethod(
        Invocation.method(
          #getAllCrews,
          [request],
        ),
        returnValue: _i8.Future<_i6.GetAllCrewsResponse>.value(
            _FakeGetAllCrewsResponse_4(
          this,
          Invocation.method(
            #getAllCrews,
            [request],
          ),
        )),
      ) as _i8.Future<_i6.GetAllCrewsResponse>);
}