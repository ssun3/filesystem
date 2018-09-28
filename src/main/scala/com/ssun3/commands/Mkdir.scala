package com.ssun3.commands

import com.ssun3.files.{DirEntry, Directory}
import com.ssun3.filesystem.State


class Mkdir(name: String) extends CreateEntry(name) {
  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}
