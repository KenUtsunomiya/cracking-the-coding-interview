JAVAC=javac
JAVA=java
TEST=Test
TEMPLATE_DIR=../template

.PHONY: setup
setup:
	@if [ -z "$(DIR)" ]; then \
		echo "Error: Specify directory name to create"; \
	elif [ ! -d "$(DIR)" ]; then \
		mkdir -p $(DIR); \
		cp $(TEMPLATE_DIR)/*.java $(DIR)/; \
		echo "Created directory $(DIR)"; \
	else \
		echo "Error: Directory $(DIR) already exists"; \
	fi

.PHONY: test run clean
test:
	@$(MAKE) run DIR=$(DIR)

run:
	@if [ -z "$(DIR)" ]; then \
		echo "Error: Specify directory (e.g. make test DIR=0.0)"; \
	elif [ -d "$(DIR)" ]; then \
		echo "Running tests in $(DIR)"; \
		cd $(DIR); \
		$(JAVAC) *.java; \
		$(JAVA) $(TEST); \
		cd ..; \
		$(MAKE) clean DIR=$(DIR); \
	else \
		echo "Error: Directory ${DIR} not exists"; \
	fi

clean:
	@rm -f $(DIR)/*.class