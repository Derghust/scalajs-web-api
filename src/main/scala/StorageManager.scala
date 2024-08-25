package org.derghust.scalajs.web.api

import org.derghust.scalajs.web.api.Navigator.Navigator

import scala.scalajs.js
import scala.scalajs.js.annotation.*
import scala.scalajs.js.Promise

object StorageManager:
  @js.native
  trait StorageEstimate extends js.Object:
    val usage: js.UndefOr[Double] = js.native
    val quota: js.UndefOr[Double] = js.native

  @js.native
  @JSGlobalScope
  object Globals extends js.Object:
    def navigator: Navigator = js.native

  @js.native
  trait StorageManager extends js.Object:
    def estimate(): Promise[StorageEstimate] = js.native
