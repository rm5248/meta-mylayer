cmake_minimum_required(VERSION 3.12)
project(ExampleBinary)

find_package(libfoo)

add_executable(example-binary example-binary.c)
target_link_libraries(example-binary PRIVATE foo)

install(TARGETS example-binary RUNTIME DESTINATION bin)
