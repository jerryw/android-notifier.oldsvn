/*
 * Android Notifier Desktop is a multiplatform remote notification client for Android devices.
 *
 * Copyright (C) 2010  Leandro Aparecido
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.code.notifier.desktop.notification.broadcast;

import com.google.code.notifier.desktop.*;
import com.google.code.notifier.desktop.app.*;
import com.google.inject.*;

public class TrayNotificationBroadcaster extends AbstractLifecycle implements NotificationBroadcaster {

	@Inject
	private TrayManager trayManager;

	@Override
	public String getName() {
		return "System default";
	}

	@Override
	public void broadcast(Notification notification) {
		if (!isRunning()) {
			return;
		}

		trayManager.showNotification(notification);
	}
}
