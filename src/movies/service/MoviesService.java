/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package movies.service;

public interface MoviesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
