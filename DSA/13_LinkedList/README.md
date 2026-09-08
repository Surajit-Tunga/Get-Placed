# Linked List:

- Linked List is basically chains of nodes where each node contains information such as data and a pointer to the next node in the chain.
- Allows efficient insertion and deletion operations compared to arrays.

### Basic Terminologies of Linked List:

- **Head:** The Head of a linked list is a pointer to the first node or reference of the first node of linked list. This pointer marks the beginning of the linked list.
- **Node:** Linked List consists of a series of nodes where each node has two parts: data and next pointer.
- **Data:** Data is the part of node which stores the information in the linked list.
- **Next pointer:** Next pointer is the part of the node which points to the next node of the linked list.

```text

Head
  |
  ↓
┌───────────┬───────────┐      ┌───────────┬───────────┐      ┌───────────┬───────────┐
│   Data    │   Next    │ ───→ │   Data    │   Next    │ ───→ │   Data    │   Next    │ ───→ NULL
└───────────┴───────────┘      └───────────┴───────────┘      └───────────┴───────────┘
      ↑
     Node
```
## Singly Linked List:

- A singly linked list is a fundamental data structure, it consists of nodes where each node contains a data field and a reference to the next node in the linked list. The next of the last node is null, indicating the end of the list. 
- In a singly linked list, each node consists of two parts: data and a pointer to the next node. This structure allows nodes to be dynamically linked together, forming a chain-like sequence.

**Implementaion:** 

```