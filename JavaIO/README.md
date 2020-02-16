
# Serialization

- Security: a security risk of serialization is that someone could tamper with files storing objects. Classes can define their own readObject and writeObject which can override the default methods. This **enables class-specific checks** to be made.
- Transient attributes: sensitive or non-persistent attributes may be marked with the **keyword transient**. They will then be skipped when the object is serialized.
- Versioning: serialized objects have a **class fingerprint** which will change if attributes are added or taken away. By obtaining the fingerprint of an early version of a class it is still possible for updated code to read in old object stores.

## Summary
- Reading structured text using string tokenizers
- Random access of records from files, and fixed length records
- Object serialization: **saving and restoring objects in binary format**