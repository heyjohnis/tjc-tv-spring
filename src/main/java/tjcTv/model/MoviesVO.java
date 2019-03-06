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
	private String thumbnail_src = "";
	private String cat_cd = "";
	private String cat_nm = "";
	private String youtube_id = "";
	
	public String getYoutube_id() {
		return youtube_id;
	}
	public void setYoutube_id(String youtube_id) {
		this.youtube_id = youtube_id;
	}
	public String getCat_cd() {
		return cat_cd;
	}
	public void setCat_cd(String cat_cd) {
		this.cat_cd = cat_cd;
	}
	public String getCat_nm() {
		return cat_nm;
	}
	public void setCat_nm(String cat_nm) {
		this.cat_nm = cat_nm;
	}
	public String getThumbnail_src() {
		return thumbnail_src;
	}
	public void setThumbnail_src(String thumbnail_src) {
		this.thumbnail_src = thumbnail_src;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
