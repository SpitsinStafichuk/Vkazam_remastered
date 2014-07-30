/*******************************************************************************
 * Copyright 2014 SpitsinStafichuk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.SpitsinStafichuk.vkazam_remastered;

/**
 * Pack of fragment "names" (labels), that used by {@link DrawerActivity} and
 * {@link com.SpitsinStafichuk.vkazam_remastered.adapters.components.VkazamDrawerAdapterElement}
 * for defining what fragment should opens, when some drawer item is clicked.
 *
 * @author Michael Spitsin
 * @since 2014-07-30
 */
public enum FragmentName {
    TAG_ONCE,
    TAG_BY_TIMER,
    HISTORY,
    FAVORITES,
    TRASH,
    FINGERPRINTS,
    SETTINGS,
    ABOUT,
    SEND_FEEDBACK
}
