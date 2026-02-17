## Problem Scenario
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.

**Requirements:**
<ol>
  <li><b>Idle State:</b></li>
    <ul style="list-style-type: disc;">
      <li>Allow item selection.</li>
      <li>Disallow dispensing items and inserting coins.</li>
    </ul>
  <li><b>ItemSelected State:</b></li>
    <ul style="list-style-type: disc;">
      <li>Allow inserting coins and dispensing items.</li>
      <li>Disallow item selection.</li>
    </ul>
  <li><b>Dispensing State:</b></li>
    <ul style="list-style-type: disc;">
      <li>Allow no operations.</li>
      <li>Automatically transition back to the "Idle" state after dispensing is complete.</li>
    </ul>
  <li><b>OutOfOrder State:</b></li>
    <ul style="list-style-type: disc;">
      <li>Disallow all operations.</li>
    </ul>
</ol>

<b>Current System:</b> The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

**Implement the State Pattern to improve code maintainability and flexibility:**
<ol>
  <li><b>Define VendingMachine States:</b></li>
    <ul style="list-style-type: disc;">
      <li>Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.</li>
    </ul>
  <li><b>Implement State Interface:</b></li>
    <ul style="list-style-type: disc;">
      <li>Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.</li>
    </ul>
  <li><b>Implement State Behaviors:</b></li>
    <ul style="list-style-type: disc;">
      <li>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</li>
    </ul>
  <li><b>Update VendingMachine Class:</b></li>
    <ul style="list-style-type: disc;">
      <li>Include attributes for item inventory and balance.</li>
      <li>Remove state-specific logic from the VendingMachine class.</li>
      <li>Introduce a reference to the current VendingMachineState object.</li>
      <li>Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.</li>
    </ul>
</ol>

## UML Diagram
![UML Diagram](UML%20Diagram.png)
