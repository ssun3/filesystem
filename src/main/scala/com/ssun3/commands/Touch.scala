package com.ssun3.commands

import com.ssun3.files.{DirEntry, File}
import com.ssun3.filesystem.State


class Touch(name: String) extends CreateEntry(name) {
  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
