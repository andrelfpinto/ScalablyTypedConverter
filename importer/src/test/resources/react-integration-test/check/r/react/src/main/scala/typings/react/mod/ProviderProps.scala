package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Context via RenderProps
@js.native
trait ProviderProps[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var value: T = js.native
}

object ProviderProps {
  @scala.inline
  def apply[T](value: T, children: ReactNode = null): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

