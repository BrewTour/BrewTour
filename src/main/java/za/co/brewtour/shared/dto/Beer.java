/**
 * Copyright (C) 2013 BrewTour
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * 
 */
package za.co.brewtour.shared.dto;

import com.gwtplatform.dispatch.annotation.GenDto;
import com.gwtplatform.dispatch.annotation.Order;

/**
 * Generates BeerDto
 * 
 * @author Ivan.Fourie
 */
@GenDto
public class Beer {
	@Order(1)
	String name;
	@Order(2)
	String description;
	@Order(3)
	String brewery;
	@Order(4)
	String breweryUrl;
	@Order(5)
	String location;
	@Order(6)
	String beerStyle;
	@Order(7)
	String abv;
	@Order(8)
	String imageUrl;
}
