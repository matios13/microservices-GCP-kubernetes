
#!/bin/bash

if [ "$1" != "" ]; then
    find . -name '*.yaml' -exec sed -i -e "s/<your_project_name>/$1/g" {} \;
else
    echo "You need to specify your project name"
fi

