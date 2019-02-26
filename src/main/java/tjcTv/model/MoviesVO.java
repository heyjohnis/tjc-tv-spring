package tjcTv.model;

import java.util.List;

public class MoviesVO {

	private String id="";
	private String term_taxonomy_id="";
	private String catagory="";
	private String title="";
	private String content="";
	private String reg_date="";
	private String url="";
	
	List list;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTerm_taxonomy_id() {
		return term_taxonomy_id;
	}
	public void setTerm_taxonomy_id(String term_taxonomy_id) {
		this.term_taxonomy_id = term_taxonomy_id;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
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
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
}
