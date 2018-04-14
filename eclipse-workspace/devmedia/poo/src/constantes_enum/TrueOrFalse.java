package constantes_enum;

public enum TrueOrFalse {
	
	FALSE(0, "false"), TRUE(1, "true");
	
	private int index;
	private String desc;
	
	private TrueOrFalse(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	public int getIndex() {
		return index;
	}


	public String getDesc() {
		return desc;
	}

	
}
