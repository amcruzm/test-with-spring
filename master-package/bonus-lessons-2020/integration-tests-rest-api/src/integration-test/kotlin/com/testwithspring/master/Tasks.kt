package com.testwithspring.master

import com.testwithspring.master.task.TaskResolution
import com.testwithspring.master.task.TaskStatus

class Tasks {

    companion object {

        const val ID_NOT_FOUND = 99L
    }

    class WriteExampleApplication {

        companion object {

            const val ID = 1L
            const val ASSIGNEE_ID = 1L
            const val CLOSER_ID = 1L
            const val CREATOR_ID = 1L
            const val DESCRIPTION = "This example contains integration tests"
            const val MODIFIER_ID = 1L
            const val TITLE = "Write example application"
            val RESOLUTION = TaskResolution.DONE
            val STATUS = TaskStatus.CLOSED
        }

        class Tags {

            class Example {

                companion object {

                    const val ID = 1L
                    const val NAME = "example"
                }
            }
        }
    }

    class WriteLesson {

        companion object {

            const val ID = 2L;
            const val CREATOR_ID = 1L
            const val DESCRIPTION = "This lesson talks about integration testing";
            const val TITLE = "Write lesson"
            val STATUS = TaskStatus.OPEN
        }
    }
}