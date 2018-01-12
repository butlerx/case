# Notes

## Real World Protocols

### SSL
#### Architecture
##### Session
- association between client and server
- created by _Handshake Protocol_
- Define set of crypto parameters
- may be shared by multiple SSl Connections
- uses costly publuc Key operations
##### Connection
- transient, peer to peer
- associated with one ssl session
- has effient protocol for opening new connections given exisiting session
#### Record Protocol
##### Confidentiality
- symmetric encryption with shared key  defined in handshake
- compressed before encrypting
##### Message integrity
- using a Message auth(MAC)  with Shared secret Key
- similar to HMAC but different padding
#### Change Cipher 
- one 
