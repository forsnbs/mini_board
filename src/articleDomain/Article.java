package articleDomain;

import java.sql.Date;

public class Article {
	
	private int number;
	private String title;
	private String content;
	private String writer;
	private Date WriteDate;
	private String readCount;
	
	public Article() {
		
	}
// 글쓰기용
	public Article(String title, String content, String writer) {
		
		this.title = title;
		this.content = content;
		this.writer = writer;
		
	}
//글목록 조회
	public Article(int number, String title, String writer, Date writeDate, String readCount) {
		super();
		this.number = number;
		this.title = title;
		this.writer = writer;
		WriteDate = writeDate;
		this.readCount = readCount;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDate() {
		return WriteDate;
	}
	public void setWriteDate(Date writeDate) {
		WriteDate = writeDate;
	}
	public String getReadCount() {
		return readCount;
	}
	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}
	
	
	
	

}
