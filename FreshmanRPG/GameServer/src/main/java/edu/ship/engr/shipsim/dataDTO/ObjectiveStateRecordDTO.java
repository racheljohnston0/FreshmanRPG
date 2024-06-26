package edu.ship.engr.shipsim.dataDTO;

import edu.ship.engr.shipsim.datatypes.ObjectiveStateEnum;

import java.time.LocalDate;
import java.util.Date;

/**
 * A data transfer record that contains the state of one objective for one
 * player
 *
 * @author Merlin
 */
public class ObjectiveStateRecordDTO
{

    private int playerID;
    private int questID;
    private int objectiveID;
    private ObjectiveStateEnum state;
    private boolean needingNotification;
    private LocalDate dateCompleted;

    /**
     * @param playerID            the player
     * @param questID             the quest that contains the objective
     * @param objectiveID         the objective
     * @param state               the player's state for that objective
     * @param needingNotification true if the player should be notified about
     *                            this objective state
     */
    public ObjectiveStateRecordDTO(int playerID, int questID, int objectiveID, ObjectiveStateEnum state,
                                   boolean needingNotification, LocalDate dateCompleted)
    {
        this.playerID = playerID;
        this.questID = questID;
        this.objectiveID = objectiveID;
        this.state = state;
        this.needingNotification = needingNotification;
        this.dateCompleted = dateCompleted;
    }

    /**
     * @return the objective ID
     */
    public int getObjectiveID()
    {
        return objectiveID;
    }

    /**
     * @return the player's ID
     */
    public int getPlayerID()
    {
        return playerID;
    }

    /**
     * @return the quest ID
     */
    public int getQuestID()
    {
        return questID;
    }

    /**
     * @return the state
     */
    public ObjectiveStateEnum getState()
    {
        return state;
    }


    /**
     * @return the date the objective was completed
     */
    public LocalDate getDateCompleted()
    {
        return dateCompleted;
    }
    /**
     * @return true if the player has not been notified that this objective is
     * in this state
     */
    public boolean isNeedingNotification()
    {
        return needingNotification;
    }

    /**
     * @param newState the state this objective should have
     */
    public void setState(ObjectiveStateEnum newState)
    {
        this.state = newState;
    }

    /**
     * Remember whether the player needs to be notified about the state we are
     * in
     *
     * @param b true if we should notify the player
     */
    public void setNeedingNotification(boolean b)
    {
        this.needingNotification = b;
    }
}