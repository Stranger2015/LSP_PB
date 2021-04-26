protoc.exe -I=./lib -I=./protobuf/src --descriptor_set_out=error.schema.descr --java_out=./protobuf/target/generated_sources ./protobuf/src/protocol/error.proto
pause
