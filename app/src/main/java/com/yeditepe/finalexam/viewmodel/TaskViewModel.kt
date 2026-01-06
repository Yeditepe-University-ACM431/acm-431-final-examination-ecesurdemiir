package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    var taskList = mutableStateListOf(taskA(1, "final", false), taskB(2, "midterm", false)
    // Initially add at least 2 tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val task = taskList.find { it.id == taskId }
        task?.isCompleted = !task.isCompleted
    }
}
