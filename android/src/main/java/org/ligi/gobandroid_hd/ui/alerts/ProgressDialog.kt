/**

 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as
 * published by the Free Software Foundation;

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see //www.gnu.org/licenses/>.

 */

package org.ligi.gobandroid_hd.ui.alerts

import android.content.Context
import kotlinx.android.synthetic.main.dialog_game_load.view.*
import org.ligi.gobandroid_hd.R
import org.ligi.gobandroid_hd.ui.GobandroidDialog

open class ProgressDialog(context: Context) : GobandroidDialog(context) {

    val message by lazy { container.message}
    val progress by lazy { container.progressBar}

    init {
        setContentView(R.layout.dialog_game_load)
        setCancelable(false)
    }

}