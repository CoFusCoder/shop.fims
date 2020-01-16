package shop.fims.vo;

public class Board {
	private String boardCd;			//게시판번호코드	//board_cd
	private String boardPw;			//게시판비밀번호	//board_pw
	private String boardTitle;		//제목			//board_title
	private String boardContent;	//내용			//board_content
	private String boardWriter;		//작성자			//board_writer
	private String boardDt;			//작성일			//board_dt
	private int boardNum;		//게시글번호	//board_num
	
	public String getBoardCd() {
		return boardCd;
	}
	public void setBoardCd(String boardCd) {
		this.boardCd = boardCd;
	}
	public String getBoardPw() {
		return boardPw;
	}
	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
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
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	@Override
	public String toString() {
		return "Board [boardCd=" + boardCd + ", boardPw=" + boardPw + ", boardTitle=" + boardTitle + ", boardContent="
				+ boardContent + ", boardWriter=" + boardWriter + ", boardDt=" + boardDt + ", boardNum=" + boardNum
				+ "]";
	}
	

	



	

	
}
