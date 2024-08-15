| Classes  | Methods                                        | Scenarios                         | Outputs                        |
|----------|------------------------------------------------|-----------------------------------|--------------------------------|
| Todolist | addTasks(String tasks)                         | If tasks are not in Todolist      | True                           |
|          |                                                | If tasks are in Todolist          | False                          |
|          |                                                |                                   |                                |
|          | getAllTasks()                                  | Always                            | List<Task>                     |
|          |                                                |                                   |                                |
|          | changeTaskStatus(String tasks, boolean status) | If the task exists, update status | True                           |
|          |                                                | If the task does not exist        | False                          |
|          |                                                |                                   |                                |
|          | getCompetedTasks()                             | Always                            | List<Task>                     |
|          |                                                | Always                            | List<Task>                     |
|          | getIncompletedTasks()                          |                                   |                                |
|          |                                                |                                   |                                |
|          | searchTask(String task)                        | If task find                      | Print(Task) (True)             |
|          |                                                | If task not found                 | Print('No task found') (False) |
|          |                                                |                                   |                                |
|          | removeTasks(String tasks)                      | If task exist                     | True (removed)                 |
|          |                                                | If task not exist                 | False ErrorMessage             |
|          |                                                |                                   |                                |
|          | getAllTaskSorted(boolean ascending)            | If ascending = true               | List<Task>                     |
|          |                                                | If ascending = false              | List<Task>                     |
