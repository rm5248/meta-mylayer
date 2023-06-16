cmake_minimum_required(VERSION 3.12)

project(Libfoo VERSION 0.1)

add_library(foo STATIC foo.c foo.h)
set_property(TARGET foo PROPERTY PUBLIC_HEADER foo.h)

include(GNUInstallDirs)

install(TARGETS foo
	EXPORT fooTargets
	ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}"
	PUBLIC_HEADER DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/"
)

#
# Support for find_package
#
install(EXPORT fooTargets
  FILE        libfooConfig.cmake
  DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/libfoo
)

include(CMakePackageConfigHelpers)
write_basic_package_version_file("${CMAKE_CURRENT_BINARY_DIR}/libfooConfigVersion.cmake"
  VERSION       ${PROJECT_VERSION}
  COMPATIBILITY SameMajorVersion
)
install(FILES   "${CMAKE_CURRENT_BINARY_DIR}/libfooConfigVersion.cmake"
  DESTINATION   ${CMAKE_INSTALL_LIBDIR}/cmake/libfoo
)


