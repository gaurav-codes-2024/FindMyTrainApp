public class Train {
    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Train(String trainId, String trainName, String type) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainName='" + trainName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    private String trainId;
    private String trainName;
    private String type;


}
