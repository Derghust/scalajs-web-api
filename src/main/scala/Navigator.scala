package org.derghust.scalajs.web.api

import StorageManager.StorageManager

import scala.scalajs.js

object Navigator:
  @js.native
  trait Navigator extends js.Object:
    val storage: StorageManager = js.native
