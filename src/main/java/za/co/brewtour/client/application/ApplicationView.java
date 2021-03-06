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
package za.co.brewtour.client.application;

import za.co.brewtour.client.application.header.HeaderView;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * @author Ivan Fourie
 * @author Michael Bester
 */
public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
   public interface Binder extends UiBinder<Widget, ApplicationView> {
   }

   @UiField(provided = true)
   HeaderView header;
   @UiField
   SimplePanel main;

   @Inject
   public ApplicationView(final Binder binder, HeaderView header) {
	   this.header = header;
	   
	   initWidget(binder.createAndBindUi(this));
   }

   /*
    * (non-Javadoc)
    * @see com.gwtplatform.mvp.client.ViewImpl#setInSlot(java.lang.Object, com.google.gwt.user.client.ui.Widget)
    */
   @Override
   public void setInSlot(Object slot, Widget content) {
       if (content != null) {
           if (slot == ApplicationPresenter.TYPE_SetMainContent) {
               main.setWidget(content);
           }
       }
   }
}
