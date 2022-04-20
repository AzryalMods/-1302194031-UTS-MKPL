package lib;

public class ChildData {
    private String childNames;
	private String childIdNumbers;

    public ChildData(String childName, String childIdNumbers) {
        this.childNames = childName;
        this.childIdNumbers = childIdNumbers;
    }

    public String getChildName() {
        return childNames;
    }

    public void setChildName(String childName) {
        this.childNames = childName;
    }

    public String getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(String childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
}