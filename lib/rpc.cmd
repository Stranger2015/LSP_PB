protoc.exe -I=./lib -I=./protobuf/src/protocol/rpc --descriptor_set_out=rpc.schema.zip --java_out=./protobuf/target/generated_sources ./protobuf/src/protocol/rpc/rpc.proto

pause