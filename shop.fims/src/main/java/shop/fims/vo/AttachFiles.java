package shop.fims.vo;

public class AttachFiles {
	private String fileCd;
	private String festprProCd;	
	private String fileNm;
	private long fileSize;
	private String fileWriter;
	private String fileInsertDt;
	public String getFileCd() {
		return fileCd;
	}
	public void setFileCd(String fileCd) {
		this.fileCd = fileCd;
	}
	public String getFestprProCd() {
		return festprProCd;
	}
	public void setFestprProCd(String festprProCd) {
		this.festprProCd = festprProCd;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileWriter() {
		return fileWriter;
	}
	public void setFileWriter(String fileWriter) {
		this.fileWriter = fileWriter;
	}
	public String getFileInsertDt() {
		return fileInsertDt;
	}
	public void setFileInsertDt(String fileInsertDt) {
		this.fileInsertDt = fileInsertDt;
	}
	@Override
	public String toString() {
		return "AttachFiles [fileCd=" + fileCd + ", festprProCd=" + festprProCd + ", fileNm=" + fileNm + ", fileSize="
				+ fileSize + ", fileWriter=" + fileWriter + ", fileInsertDt=" + fileInsertDt + "]";
	}

}
