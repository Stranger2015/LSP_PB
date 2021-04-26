protoc.exe -I=./lib -I=./protobuf/src --descriptor_set_out=protocol.schema.descr --java_out=./protobuf/target/generated_sources ./protobuf/src/protocol/protocol.proto
pause
