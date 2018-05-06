// Generated by delombok at Thu Nov 16 13:48:05 CST 2017
package com.egzosn.pay.paypal.bean.order;


public class ErrorDetails {
	/**
	 * Name of the field that caused the error.
	 */
	private String field;
	/**
	 * Reason for the error.
	 */
	private String issue;


	/**
	 * Default Constructor
	 */
	public ErrorDetails() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ErrorDetails(String field, String issue) {
		this.field = field;
		this.issue = issue;
	}

	/**
	 * Name of the field that caused the error.
	 */
	@SuppressWarnings("all")
	public String getField() {
		return this.field;
	}

	/**
	 * Reason for the error.
	 */
	@SuppressWarnings("all")
	public String getIssue() {
		return this.issue;
	}


	/**
	 * Name of the field that caused the error.
	 * @return this
	 */
	@SuppressWarnings("all")
	public ErrorDetails setField(final String field) {
		this.field = field;
		return this;
	}

	/**
	 * Reason for the error.
	 * @return this
	 */
	@SuppressWarnings("all")
	public ErrorDetails setIssue(final String issue) {
		this.issue = issue;
		return this;
	}

}
