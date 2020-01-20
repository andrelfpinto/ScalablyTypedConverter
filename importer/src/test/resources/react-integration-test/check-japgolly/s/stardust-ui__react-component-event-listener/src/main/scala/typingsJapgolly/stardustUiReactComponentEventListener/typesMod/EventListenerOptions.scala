package typingsJapgolly.stardustUiReactComponentEventListener.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerOptions[T /* <: EventTypes */] extends js.Object {
  /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
  var capture: js.UndefOr[Boolean] = js.native
  /** A function which receives a notification when an event of the specified type occurs. */
  var listener: EventHandler[T] = js.native
  /** A ref object with a target node. */
  var targetRef: RefHandle[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ] = js.native
  /** A case-sensitive string representing the event type to listen for. */
  var `type`: T = js.native
}

object EventListenerOptions {
  @scala.inline
  def apply[T /* <: EventTypes */](
    listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Callback,
    targetRef: RefHandle[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
    ],
    `type`: T,
    capture: js.UndefOr[Boolean] = js.undefined
  ): EventListenerOptions[T] = {
    val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any) => listener(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerOptions[T]]
  }
}

