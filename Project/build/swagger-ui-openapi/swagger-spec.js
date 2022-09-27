window.swaggerSpec={
  "openapi" : "3.0.1",
  "info" : {
    "title" : "Web3j OpenApi",
    "contact" : {
      "name" : "Web3 Labs",
      "url" : "http://web3labs.com",
      "email" : "hi@web3labs.com"
    },
    "version" : "4.8.1"
  },
  "tags" : [ {
    "name" : "default",
    "description" : "Lists existing contracts and events"
  }, {
    "name" : "HelloWorld Methods",
    "description" : "List HelloWorld method&#39;s calls"
  }, {
    "name" : "HelloWorld Events",
    "description" : "List HelloWorld event&#39;s calls"
  }, {
    "name" : "Migrations Methods",
    "description" : "List Migrations method&#39;s calls"
  }, {
    "name" : "Migrations Events",
    "description" : "List Migrations event&#39;s calls"
  }, {
    "name" : "Mortal Methods",
    "description" : "List Mortal method&#39;s calls"
  }, {
    "name" : "Mortal Events",
    "description" : "List Mortal event&#39;s calls"
  }, {
    "name" : "TodoList Methods",
    "description" : "List TodoList method&#39;s calls"
  }, {
    "name" : "TodoList Events",
    "description" : "List TodoList event&#39;s calls"
  } ],
  "paths" : {
    "/HelloworldProject/contracts/migrations/{contractAddress}/setCompleted" : {
      "post" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the SetCompleted method",
        "operationId" : "setCompleted",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/SetCompletedParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/{contractAddress}/owner" : {
      "get" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the Owner method",
        "operationId" : "owner",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelString"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/{contractAddress}/last_completed_migration" : {
      "get" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the Last_completed_migration method",
        "operationId" : "last_completed_migration",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelBigInteger"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/{contractAddress}/events" : {
      "get" : {
        "tags" : [ "Migrations Events" ],
        "summary" : "List all Migrations events",
        "operationId" : "findAll",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/default/setCompleted" : {
      "post" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the SetCompleted method",
        "operationId" : "setCompleted_1",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/SetCompletedParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/default/owner" : {
      "get" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the Owner method",
        "operationId" : "owner_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelString"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/default/last_completed_migration" : {
      "get" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Execute the Last_completed_migration method",
        "operationId" : "last_completed_migration_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelBigInteger"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations/default/events" : {
      "get" : {
        "tags" : [ "Migrations Events" ],
        "summary" : "List all Migrations events",
        "operationId" : "findAll_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/migrations" : {
      "post" : {
        "tags" : [ "Migrations Methods" ],
        "summary" : "Deploys the Migrations contract",
        "operationId" : "deploy",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceipt"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/getAllTasks" : {
      "get" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the GetAllTasks method",
        "operationId" : "getAllTasks",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/tasks" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the Tasks method",
        "operationId" : "tasks",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TasksParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelTuple3BigIntegerStringBoolean"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/createTask" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the CreateTask method",
        "operationId" : "createTask",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/CreateTaskParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/toggleCompleted" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the ToggleCompleted method",
        "operationId" : "toggleCompleted",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/ToggleCompletedParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/taskCount" : {
      "get" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the TaskCount method",
        "operationId" : "taskCount",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelBigInteger"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/events" : {
      "get" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "List all TodoList events",
        "operationId" : "findAll_2",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/events/taskCompleted" : {
      "post" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "Get the TaskCompleted event",
        "operationId" : "findBy",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/TaskCompletedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/{contractAddress}/events/taskCreated" : {
      "post" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "Get the TaskCreated event",
        "operationId" : "findBy_1",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/TaskCreatedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/getAllTasks" : {
      "get" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the GetAllTasks method",
        "operationId" : "getAllTasks_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/tasks" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the Tasks method",
        "operationId" : "tasks_1",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TasksParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelTuple3BigIntegerStringBoolean"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/createTask" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the CreateTask method",
        "operationId" : "createTask_1",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/CreateTaskParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/toggleCompleted" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the ToggleCompleted method",
        "operationId" : "toggleCompleted_1",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/ToggleCompletedParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/taskCount" : {
      "get" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Execute the TaskCount method",
        "operationId" : "taskCount_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelBigInteger"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/events" : {
      "get" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "List all TodoList events",
        "operationId" : "findAll_3",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/events/taskCompleted" : {
      "post" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "Get the TaskCompleted event",
        "operationId" : "findBy_2",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/TaskCompletedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist/default/events/taskCreated" : {
      "post" : {
        "tags" : [ "TodoList Events" ],
        "summary" : "Get the TaskCreated event",
        "operationId" : "findBy_3",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/TaskCreatedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/todolist" : {
      "post" : {
        "tags" : [ "TodoList Methods" ],
        "summary" : "Deploys the TodoList contract",
        "operationId" : "deploy_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceipt"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/{contractAddress}/kill" : {
      "get" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the Kill method",
        "operationId" : "kill",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/{contractAddress}/newGreeting" : {
      "post" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the NewGreeting method",
        "operationId" : "newGreeting",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/NewGreetingParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/{contractAddress}/greeting" : {
      "get" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the Greeting method",
        "operationId" : "greeting",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelString"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/{contractAddress}/events" : {
      "get" : {
        "tags" : [ "HelloWorld Events" ],
        "summary" : "List all HelloWorld events",
        "operationId" : "findAll_4",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/{contractAddress}/events/modified" : {
      "post" : {
        "tags" : [ "HelloWorld Events" ],
        "summary" : "Get the Modified event",
        "operationId" : "findBy_4",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/ModifiedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/default/kill" : {
      "get" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the Kill method",
        "operationId" : "kill_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/default/newGreeting" : {
      "post" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the NewGreeting method",
        "operationId" : "newGreeting_1",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/NewGreetingParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/default/greeting" : {
      "get" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Execute the Greeting method",
        "operationId" : "greeting_1",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/ResultModelString"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/default/events" : {
      "get" : {
        "tags" : [ "HelloWorld Events" ],
        "summary" : "List all HelloWorld events",
        "operationId" : "findAll_5",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld/default/events/modified" : {
      "post" : {
        "tags" : [ "HelloWorld Events" ],
        "summary" : "Get the Modified event",
        "operationId" : "findBy_5",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/TransactionReceiptModel"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/ModifiedEventResponse"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/helloworld" : {
      "post" : {
        "tags" : [ "HelloWorld Methods" ],
        "summary" : "Deploys the HelloWorld contract",
        "operationId" : "deploy_2",
        "requestBody" : {
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/HelloWorldDeployParameters"
              }
            }
          }
        },
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceipt"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/mortal/{contractAddress}/kill" : {
      "get" : {
        "tags" : [ "Mortal Methods" ],
        "summary" : "Execute the Kill method",
        "operationId" : "kill_2",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/mortal/{contractAddress}/events" : {
      "get" : {
        "tags" : [ "Mortal Events" ],
        "summary" : "List all Mortal events",
        "operationId" : "findAll_6",
        "parameters" : [ {
          "name" : "contractAddress",
          "in" : "path",
          "required" : true,
          "schema" : {
            "type" : "string"
          }
        } ],
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/mortal/default/kill" : {
      "get" : {
        "tags" : [ "Mortal Methods" ],
        "summary" : "Execute the Kill method",
        "operationId" : "kill_3",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceiptModel"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/mortal/default/events" : {
      "get" : {
        "tags" : [ "Mortal Events" ],
        "summary" : "List all Mortal events",
        "operationId" : "findAll_7",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts/mortal" : {
      "post" : {
        "tags" : [ "Mortal Methods" ],
        "summary" : "Deploys the Mortal contract",
        "operationId" : "deploy_3",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/TransactionReceipt"
                }
              }
            }
          }
        }
      }
    },
    "/HelloworldProject/contracts" : {
      "get" : {
        "operationId" : "findAll_9",
        "responses" : {
          "default" : {
            "description" : "default response",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "string"
                  }
                }
              }
            }
          }
        }
      }
    }
  },
  "components" : {
    "schemas" : {
      "LogsModel" : {
        "type" : "object",
        "properties" : {
          "removed" : {
            "type" : "boolean"
          },
          "logIndex" : {
            "type" : "integer"
          },
          "transactionIndex" : {
            "type" : "integer"
          },
          "transactionHash" : {
            "type" : "string"
          },
          "blockHash" : {
            "type" : "string"
          },
          "blockNumber" : {
            "type" : "integer"
          },
          "address" : {
            "type" : "string"
          },
          "data" : {
            "type" : "string"
          },
          "type" : {
            "type" : "string"
          },
          "topics" : {
            "type" : "array",
            "items" : {
              "type" : "string"
            }
          }
        }
      },
      "TransactionReceiptModel" : {
        "type" : "object",
        "properties" : {
          "transactionHash" : {
            "type" : "string"
          },
          "transactionIndex" : {
            "type" : "integer"
          },
          "blockHash" : {
            "type" : "string"
          },
          "blockNumber" : {
            "type" : "integer"
          },
          "cumulativeGasUsed" : {
            "type" : "integer"
          },
          "gasUsed" : {
            "type" : "integer"
          },
          "contractAddress" : {
            "type" : "string"
          },
          "root" : {
            "type" : "string"
          },
          "status" : {
            "type" : "string"
          },
          "from" : {
            "type" : "string"
          },
          "to" : {
            "type" : "string"
          },
          "logs" : {
            "type" : "array",
            "items" : {
              "$ref" : "#/components/schemas/LogsModel"
            }
          },
          "logsBloom" : {
            "type" : "string"
          },
          "revertReason" : {
            "type" : "string"
          }
        }
      },
      "SetCompletedParameters" : {
        "type" : "object",
        "properties" : {
          "completed" : {
            "type" : "integer"
          }
        }
      },
      "ResultModelString" : {
        "type" : "object",
        "properties" : {
          "result" : {
            "type" : "string"
          }
        }
      },
      "ResultModelBigInteger" : {
        "type" : "object",
        "properties" : {
          "result" : {
            "type" : "integer"
          }
        }
      },
      "Log" : {
        "type" : "object",
        "properties" : {
          "removed" : {
            "type" : "boolean"
          },
          "logIndex" : {
            "type" : "integer"
          },
          "transactionIndex" : {
            "type" : "integer"
          },
          "transactionHash" : {
            "type" : "string"
          },
          "blockHash" : {
            "type" : "string"
          },
          "blockNumber" : {
            "type" : "integer"
          },
          "address" : {
            "type" : "string"
          },
          "data" : {
            "type" : "string"
          },
          "type" : {
            "type" : "string"
          },
          "topics" : {
            "type" : "array",
            "items" : {
              "type" : "string"
            }
          },
          "transactionIndexRaw" : {
            "type" : "string"
          },
          "logIndexRaw" : {
            "type" : "string"
          },
          "blockNumberRaw" : {
            "type" : "string"
          }
        }
      },
      "TransactionReceipt" : {
        "type" : "object",
        "properties" : {
          "transactionHash" : {
            "type" : "string"
          },
          "transactionIndex" : {
            "type" : "integer"
          },
          "blockHash" : {
            "type" : "string"
          },
          "blockNumber" : {
            "type" : "integer"
          },
          "cumulativeGasUsed" : {
            "type" : "integer"
          },
          "gasUsed" : {
            "type" : "integer"
          },
          "contractAddress" : {
            "type" : "string"
          },
          "root" : {
            "type" : "string"
          },
          "status" : {
            "type" : "string"
          },
          "from" : {
            "type" : "string"
          },
          "to" : {
            "type" : "string"
          },
          "logs" : {
            "type" : "array",
            "items" : {
              "$ref" : "#/components/schemas/Log"
            }
          },
          "logsBloom" : {
            "type" : "string"
          },
          "revertReason" : {
            "type" : "string"
          },
          "cumulativeGasUsedRaw" : {
            "type" : "string"
          },
          "transactionIndexRaw" : {
            "type" : "string"
          },
          "blockNumberRaw" : {
            "type" : "string"
          },
          "gasUsedRaw" : {
            "type" : "string"
          },
          "statusOK" : {
            "type" : "boolean"
          }
        }
      },
      "ResultModelTuple3BigIntegerStringBoolean" : {
        "type" : "object",
        "properties" : {
          "result" : {
            "$ref" : "#/components/schemas/Tuple3BigIntegerStringBoolean"
          }
        }
      },
      "Tuple3BigIntegerStringBoolean" : {
        "type" : "object",
        "properties" : {
          "value1" : {
            "type" : "integer"
          },
          "value2" : {
            "type" : "string"
          },
          "value3" : {
            "type" : "boolean"
          },
          "size" : {
            "type" : "integer",
            "format" : "int32"
          }
        }
      },
      "TasksParameters" : {
        "type" : "object",
        "properties" : {
          "input0" : {
            "type" : "integer"
          }
        }
      },
      "CreateTaskParameters" : {
        "type" : "object",
        "properties" : {
          "_content" : {
            "type" : "string"
          }
        }
      },
      "ToggleCompletedParameters" : {
        "type" : "object",
        "properties" : {
          "_id" : {
            "type" : "integer"
          }
        }
      },
      "TaskCompletedEventResponse" : {
        "type" : "object",
        "properties" : {
          "id" : {
            "type" : "integer"
          },
          "completed" : {
            "type" : "boolean"
          }
        }
      },
      "TaskCreatedEventResponse" : {
        "type" : "object",
        "properties" : {
          "id" : {
            "type" : "integer"
          },
          "content" : {
            "type" : "string"
          },
          "completed" : {
            "type" : "boolean"
          }
        }
      },
      "NewGreetingParameters" : {
        "type" : "object",
        "properties" : {
          "_greet" : {
            "type" : "string"
          }
        }
      },
      "ModifiedEventResponse" : {
        "type" : "object",
        "properties" : {
          "oldGreetingIdx" : {
            "type" : "array",
            "items" : {
              "type" : "string",
              "format" : "byte"
            }
          },
          "newGreetingIdx" : {
            "type" : "array",
            "items" : {
              "type" : "string",
              "format" : "byte"
            }
          },
          "oldGreeting" : {
            "type" : "string"
          },
          "newGreeting" : {
            "type" : "string"
          }
        }
      },
      "HelloWorldDeployParameters" : {
        "type" : "object",
        "properties" : {
          "_greet" : {
            "type" : "string"
          }
        }
      }
    }
  }
}