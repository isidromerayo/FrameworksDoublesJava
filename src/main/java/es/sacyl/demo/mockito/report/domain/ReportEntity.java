package es.sacyl.demo.mockito.report.domain;

import java.util.Date;

public class ReportEntity {

	private Long reportId;
	private Date startDate;
	private Date endDate;
	private byte[] content;

	/**
	 * @return the reportId
	 */
	public Long getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	/**
	 * 
	 * @return
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * 
	 * @return
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
