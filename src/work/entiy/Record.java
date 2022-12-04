package work.entiy;

import java.util.Arrays;

public class Record {

	private final String[] userId = new String[99];
	private final int[] scores = new int[99];
	private final int[] timeDifference = new int[99];
	private final String[] evaluation = new String[99];
	public int a = 0;
	public Record() {
	}

	public String getUserId(int a) {
		return userId[a];
	}

	public void setUserId(String userId) {
		this.userId[a] = userId;
	}

	public int getScores(int a) {
		return scores[a];
	}

	public void setScores(int scores) {
		this.scores[a] = scores;
	}

	public int getTimeDifference(int a) {
		return timeDifference[a];
	}

	public void setTimeDifference(int timeDifference) {
		this.timeDifference[a] = timeDifference;
	}

	public String getEvaluation(int a) {
		return evaluation[a];
	}

	public void setEvaluation(String evaluation) {
		this.evaluation[a] = evaluation;
	}

	@Override
	public String toString() {
		return "Record{" +
				"userId=" + Arrays.toString(userId) +
				", scores=" + Arrays.toString(scores) +
				", timeDifference=" + Arrays.toString(timeDifference) +
				", evaluation=" + Arrays.toString(evaluation) +
				'}';
	}
}
