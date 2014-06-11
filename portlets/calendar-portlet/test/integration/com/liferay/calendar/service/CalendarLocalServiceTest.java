/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service;

import com.liferay.ant.arquilian.WebArchiveBuilder;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Arquillian.class)
public class CalendarLocalServiceTest {

	@Deployment
	public static WebArchive createDeployment() {
		return WebArchiveBuilder.build();
	}

	@Test
	public void testGetCalendarsCount() {
		int count = CalendarLocalServiceUtil.getCalendarsCount();

		Assert.assertEquals(0, count);
	}

}