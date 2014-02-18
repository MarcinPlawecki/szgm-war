package szgm.core;

import java.util.Date;

import javax.persistence.Column;

public class BaseBean {

	private Date creationTime;
	
	private Date modifiedTime;
	
	private String modifiedBy;

	private long version;
	
	@Column(name="CREATION_TIME", nullable=false)
	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	@Column(name="MODIFIED_TIME", nullable=false)
	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name="MODIFIED_BY", nullable=false)
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name="VERSION", nullable=false)
	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
	
}
