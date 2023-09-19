/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package movies.setup;

import static movies.constants.MoviesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import movies.constants.MoviesConstants;
import movies.service.MoviesService;


@SystemSetup(extension = MoviesConstants.EXTENSIONNAME)
public class MoviesSystemSetup
{
	private final MoviesService moviesService;

	public MoviesSystemSetup(final MoviesService moviesService)
	{
		this.moviesService = moviesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		moviesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MoviesSystemSetup.class.getResourceAsStream("/movies/sap-hybris-platform.png");
	}
}
