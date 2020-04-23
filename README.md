# com.sparrowlogic.crisis

## open source collaboration to help match individual needs up with NGOs who can voluntarily provide relief.

### Core concepts:
NeedRequest: This represents a request for a certain type of need (e.g., food) to be fulfilled.
NeedType: An entity that represents a type of need such as medical care, food, water, or other basic needs.
Volunteer: An organization or individual who subscribes to need requests in a certain geographic region filtered by Need Type (e.g., food).
PromiseToHelp: A commitment from a Volunteer to meet the need being requested in its entirety.

### Authentication:
Keep things simple. Validate via e-mail like other online listing services for publishing need requests to reduce spam.
Volunteers have a richer experience -- authentication may be required here.

### Accountability concepts:
Many NGOs have an ambiguous accountability structure. With Crisis, Volunteers are held accountable by NeedRequestors confirming receipt of a PromiseToHelp when they receive a good. Need Requestors present a the token that supplier can fulfill.
