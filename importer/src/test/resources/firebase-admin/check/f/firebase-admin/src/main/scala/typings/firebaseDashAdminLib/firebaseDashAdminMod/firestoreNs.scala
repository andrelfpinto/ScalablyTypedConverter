package typings
package firebaseDashAdminLib.firebaseDashAdminMod

import atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase-admin", "firestore")
@js.native
object firestoreNs extends js.Object {
  @js.native
  /**
    * @param settings Configuration object. See [Firestore Documentation]
    * {@link https://firebase.google.com/docs/firestore/}
    */
  class Firestore ()
    extends atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.Firestore {
    def this(settings: Settings) = this()
  }
  
}
