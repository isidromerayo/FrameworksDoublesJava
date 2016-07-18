/**
 * 
 */
package es.sacyl.demo.mockito.report.service;

import java.util.Date;

import es.sacyl.demo.mockito.report.domain.ReportEntity;
import es.sacyl.demo.mockito.report.interfaces.IReportGenerator;

/**
 * @author isidromerayo
 *
 */
public class ReportGeneratorService {

	private IReportGenerator reportGenerator;

	public void generateReport(Date startDate, Date endDate, byte[] content) {
		ReportEntity report = new ReportEntity();
		report.setContent(content);
		report.setStartDate(startDate);
		report.setEndDate(endDate);
		reportGenerator.generateReport(report);
	}

}
