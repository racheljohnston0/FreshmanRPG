package edu.ship.engr.shipsim.model;

import edu.ship.engr.shipsim.datasource.DatabaseException;
import edu.ship.engr.shipsim.datasource.QuestionDataGateway;

import java.io.Serial;
import java.io.Serializable;

/**
 * NPCQuestion class that modeling the questions for the quiz bot Will return a
 * random question from the database with getRandomQuestion()
 *
 * @author Ga and Frank
 */
public class NPCQuestion implements Serializable
{
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private QuestionDataGateway gateway;

    private NPCQuestion()
    {
    }

    /**
     * @return a random question from the data source
     * @throws DatabaseException if the data source can't complete the request
     */
    protected static NPCQuestion getRandomQuestion() throws DatabaseException
    {
        NPCQuestion q = new NPCQuestion();
        q.gateway = QuestionDataGateway.findRandomGateway();
        return q;
    }

    /**
     * @param questionID the ID of the question you want returned
     * @return an NPCQuestion
     */
    public static NPCQuestion getSpecificQuestion(int questionID)
    {
        NPCQuestion q = new NPCQuestion();

        try
        {
            q.gateway = new QuestionDataGateway(questionID);
        }
        catch (DatabaseException e)
        {
            return null;
        }
        return q;
    }

    /**
     * @return answer to question
     */
    public String getAnswer()
    {
        return gateway.getAnswer();
    }

    /**
     * @return question
     */
    protected String getQuestionStatement()
    {
        return gateway.getQuestionStatement();
    }

}
