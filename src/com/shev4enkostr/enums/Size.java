package com.shev4enkostr.enums;

public enum Size
{
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"), EXTRA_EXTRA_LARGE("XXL"), EXTRA_EXTRA_EXTRA_LARGE("XXXL");

	private String abbreviation;

	private Size(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}
}

