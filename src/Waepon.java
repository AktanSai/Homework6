public class Waepon {
    private String type;
    private String sword;
    public Waepon(String type, String sword) {
        this.type = type;
        this.sword = sword;
    }
    public void setBow(String bow) {
        this.type = type;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getType () {
        return type;
    }

    public String getSword() {
        return sword;
    }


}
