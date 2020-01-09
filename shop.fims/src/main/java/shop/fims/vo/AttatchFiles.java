package shop.fims.vo;

import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class AttatchFiles {
	private String fileCd;
	private String fileNm;
	private int fileNo;
	private String filePath;
	private long fileSize;
	private String fileWriter;
	private String fileInsertDt;
	public String getFileCd() {
		return fileCd;
	}
	public void setFileCd(String fileCd) {
		this.fileCd = fileCd;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
		return "AttatchFiles [fileCd=" + fileCd + ", fileNm=" + fileNm + ", fileNo=" + fileNo + ", filePath=" + filePath
				+ ", fileSize=" + fileSize + ", fileWriter=" + fileWriter + ", fileInsertDt=" + fileInsertDt + "]";
	}


	
}
