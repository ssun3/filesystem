package com.ssun3.commands

import com.ssun3.filesystem.State

class UnknownCommand extends Command {
  def apply(state: State) : State =
    state.setMessage("Command not found!")
}
