/**
 * 
 */
package es.sacyl.demo.mockito.report.interfaces;

import es.sacyl.demo.mockito.report.domain.ReportEntity;

/**
 * @author isidromerayo
 *
 */
public interface IReportGenerator {
	/**
	 * 
	 * @param report
	 */
	void generateReport(ReportEntity report);

}
