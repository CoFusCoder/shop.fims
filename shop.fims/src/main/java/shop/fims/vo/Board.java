package shop.fims.vo;

public class Board {
	private String boardCd;	//게시판번호코드
	private String boardTitle;	//제목
	private String boardContent;	//내용
	private String boardWriter;	//작성자
	private String boardDt;	//작성일
	
	public String getBoardCd() {
		return boardCd;
	}
	public void setBoardCd(String boardCd) {
		this.boardCd = boardCd;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardDt() {
		return boardDt;
	}
	public void setBoardDt(String boardDt) {
		this.boardDt = boardDt;
	}
	
}
