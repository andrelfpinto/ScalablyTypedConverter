package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// see http://docs.angularjs.org/api
///////////////////////////////////////////////////////////////////////////
@js.native
trait IAngularStatic extends js.Object {
  /**
    * Wraps a raw DOM element or HTML string as a jQuery element.
    *
    * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
    */
  @JSName("element")
  var element_Original: angularLib.JQueryStatic = js.native
  /**
    * If window.name contains prefix NG_DEFER_BOOTSTRAP! when angular.bootstrap is called, the bootstrap process will be paused until angular.resumeBootstrap() is called.
    * @param extraModules An optional array of modules that should be added to the original list of modules that the app was about to be bootstrapped with.
    */
  var resumeBootstrap: js.UndefOr[
    js.Function1[
      /* extraModules */ js.UndefOr[js.Array[java.lang.String]], 
      angularLib.angularMod.angularNs.autoNs.IInjectorService
    ]
  ] = js.native
  def element(element: angularLib.JQuery): angularLib.JQLite = js.native
  /**
    * Wraps a raw DOM element or HTML string as a jQuery element.
    *
    * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
    */
  def element(element: java.lang.String): angularLib.JQLite = js.native
  def element(element: js.Function0[scala.Unit]): angularLib.JQLite = js.native
  def element(element: stdLib.ArrayLike[stdLib.Element]): angularLib.JQLite = js.native
  def element(element: stdLib.Document): angularLib.JQLite = js.native
  def element(element: stdLib.Element): angularLib.JQLite = js.native
  def equals(value1: js.Any, value2: js.Any): scala.Boolean = js.native
  def extend(destination: js.Any, sources: js.Any*): js.Any = js.native
}
