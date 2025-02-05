# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROSaic: C++ driver for Septentrio's mosaic receivers and beyond"
AUTHOR = "Tibor Dome <tibor.doeme@alumni.ethz.ch>"
ROS_AUTHOR = "Tibor Dome"
HOMEPAGE = "https://github.com/septentrio-gnss/septentrio_gnss_driver"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause License"
LICENSE = "BSD-3-Clause-License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "septentrio_gnss_driver"
ROS_BPN = "septentrio_gnss_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-msgs \
    libpcap \
    nav-msgs \
    nmea-msgs \
    rclcpp \
    rclcpp-components \
    rosidl-default-generators \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-msgs \
    libpcap \
    nav-msgs \
    nmea-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-msgs \
    libpcap \
    nav-msgs \
    nmea-msgs \
    rclcpp \
    rclcpp-components \
    rosidl-default-runtime \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/septentrio_gnss_driver_ros2-release/archive/release/humble/septentrio_gnss_driver/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/septentrio_gnss_driver"
SRC_URI = "git://github.com/ros2-gbp/septentrio_gnss_driver_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "313344cd84bde4389c2ad31f88f12735a2715773"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
